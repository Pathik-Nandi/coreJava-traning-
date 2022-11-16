package com.tarento.assessment.data;

import com.tarento.assessment.dto.Assessment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

@Repository
public class AssessmentDaoImpl implements AssessmentDao{
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public long addAssessment(Assessment assessment) {
        KeyHolder keyHolder = new GeneratedKeyHolder();
        jdbcTemplate.update(new PreparedStatementCreator() {
            @Override
            public PreparedStatement createPreparedStatement(Connection con) throws SQLException {
                PreparedStatement ps = con.prepareStatement("Insert into assessment(assessment_id, assessment_name,max_score) VALUES(?,?,?)", new String[]{"assessment_id,assessment_name,max_score"});
                ps.setInt(1,assessment.getAssessmentId());
                ps.setString(2,assessment.getAssessmentName());
                ps.setInt(3,assessment.getMaxScore());
                return ps;
            }
        });
        return assessment.getAssessmentId();
    }

    @Override
    public Assessment getAssessment(int assessmentId) {
        String query="select * from assessment where assessment_id=?";
        return jdbcTemplate.queryForObject(query, new Object[]{assessmentId}, new AssessmentMapper());
    }
}
