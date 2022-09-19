public class NumeroPrimo {

    public boolean isNumeroPrimo(Integer numero) {
        if (numero <= 1) {
            return false;
        }
        for (int numeroAtual = 2; numeroAtual < numero; numeroAtual++) {
            if (numeroAtual % numero == 0) {
                return false;
            }
        }
        return true;
    }
}
