import java.math.BigDecimal;
import java.util.List;

public class Swapi {
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Swapi swapi = (Swapi) o;

        if (count != null ? !count.equals(swapi.count) : swapi.count != null) return false;
        if (next != null ? !next.equals(swapi.next) : swapi.next != null) return false;
        if (previous != null ? !previous.equals(swapi.previous) : swapi.previous != null) return false;
        return results != null ? results.equals(swapi.results) : swapi.results == null;
    }

    @Override
    public int hashCode() {
        int result = count != null ? count.hashCode() : 0;
        result = 31 * result + (next != null ? next.hashCode() : 0);
        result = 31 * result + (previous != null ? previous.hashCode() : 0);
        result = 31 * result + (results != null ? results.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Swapi{" +
                "count=" + count +
                ", next='" + next + '\'' +
                ", previous=" + previous +
                ", results=" + results +
                '}';
    }

    private Integer count;
private String next;
private Object previous;
private List<Result> results;

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public String getNext() {
        return next;
    }

    public void setNext(String next) {
        this.next = next;
    }

    public Object getPrevious() {
        return previous;
    }

    public void setPrevious(Object previous) {
        this.previous = previous;
    }

    public List<Result> getResults() {
        return results;
    }

    public void setResults(List<Result> results) {
        this.results = results;
    }

}