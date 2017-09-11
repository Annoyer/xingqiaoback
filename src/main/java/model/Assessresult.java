package model;

public class Assessresult {
    private Integer id;

    private Integer grademin;

    private Integer grademax;

    private String result;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getGrademin() {
        return grademin;
    }

    public void setGrademin(Integer grademin) {
        this.grademin = grademin;
    }

    public Integer getGrademax() {
        return grademax;
    }

    public void setGrademax(Integer grademax) {
        this.grademax = grademax;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result == null ? null : result.trim();
    }
}