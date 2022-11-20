import java.util.Objects;

public class FacultyMember {

    private String id;
    private int count;

    private double ratingSum = 0;

    public FacultyMember(String id,int count,int ratingSum) {
        this.id = id;
        this.count = count;
        this.ratingSum = ratingSum;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count += count;
    }

    public double getRatingSum() {
        return ratingSum;
    }

    public void setRatingSum(double ratingSum) {
        this.ratingSum += ratingSum;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FacultyMember that = (FacultyMember) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, count, ratingSum);
    }


    @Override
    public String toString() {
        return "FacultyMember{" +
                "id='" + id + '\'' +
                ", count=" + count +
                ", ratingSum=" + ratingSum +
                '}';
    }
}
