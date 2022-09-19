public class MaximoDivisorComum {

    public Integer executar(Integer numero1, Integer numero2) {
        Integer resto;

        do {
            resto = numero1 % numero2;

            numero1 = numero2;
            numero2 = resto;

        } while (resto != 0);

        return numero1;
    }
}
