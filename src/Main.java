public class Main {
    private static final Integer JANEIRO = 10000;
    private static final Integer FEVEREIRO = 17000;
    private static final Integer MARCO = 23000;

    private static Integer SomaTrimestral() {
        return(JANEIRO + FEVEREIRO + MARCO);
    }
    public static void main(String[] args) {
        System.out.println("A empresa XPTO S.A, teve um gasto total no primeiro trimestre de:" + SomaTrimestral());
    }
}