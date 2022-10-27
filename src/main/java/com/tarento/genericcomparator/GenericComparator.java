package com.tarento.genericcomparator;
import com.fasterxml.jackson.core.type.TypeReference;

import java.beans.IntrospectionException;
import java.beans.PropertyDescriptor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Comparator;

public class GenericComparator implements Comparator<Object> {
    private String fieldName;
    private Class classObj;
    public GenericComparator(String field, Class classObj) {
        this.fieldName = field;
        this.classObj = classObj;
    }

    @Override
    public int compare(Object o1, Object o2) {
        Object val1 = retrieveValue(o1, fieldName);
        Object val2 = retrieveValue(o2, fieldName);

        if (val1 == null) {
            return 0;
        } else if (val2 == null) {
            return 0;
        } else if (val1 instanceof Comparable) {
            return ((Comparable) val1).compareTo(val2);
        }
        return 0;
    }

    private Object retrieveValue(Object object, String fieldName) {
        PropertyDescriptor pd = null;
        try {
            pd = new PropertyDescriptor(fieldName, classObj);
            Method getter = pd.getReadMethod();

//            Method setter = pd.getWriteMethod();
//            setter.invoke(object, 10L);

            return object != null ? getter.invoke(object) : null;

        } catch (IntrospectionException | IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
            //swallowing the exception
        }
        return null;
    }

    }
