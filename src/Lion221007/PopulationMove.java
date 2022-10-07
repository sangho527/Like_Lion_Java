

package Lion221007;

public class PopulationMove {

    private int fromSido; // 전출
    private int toSido;   // 전입


    public PopulationMove(int fromSido, int toSido) {
        this.fromSido = fromSido;
        this.toSido = toSido;
    }

    public PopulationMove(String fromSido, String toSido) {
        this.fromSido = Integer.parseInt(fromSido);
        this.toSido = Integer.parseInt(toSido);
    }


    public int getFromSido() {
        return fromSido;
    }

    public int getToSido() {
        return toSido;
    }


}