package com.tarento.assessment.data;

import com.tarento.assessment.dto.Assessment;
import org.springframework.jdbc.core.RowMapper;

import javax.swing.tree.TreePath;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AssessmentMapper implements RowMapper <Assessment>{


    @Override
    public Assessment mapRow(ResultSet rs, int assessment_id) throws SQLException {
        Assessment assessment = new Assessment();
        assessment.setAssessmentId(rs.getInt("assessment_id"));
        assessment.setAssessmentName(rs.getString("assessment_name"));
        assessment.setMaxScore(rs.getInt("max_score"));
        return assessment;
    }
}
