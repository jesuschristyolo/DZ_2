public class TAsk {
    public static void main(String[] args) {

        System.out.println(parse_string("Основание -12б степень 7, результат"));


    }

    public static String parse_string(String in_string) {
        String[] strings = in_string.split(" ");
        int base = 0;
        int power = 0;
        double product = 0;
        for (int i = 0; i < strings.length; i++) {
            strings[i] = strings[i].replace(",", "");
            try {
                Integer.parseInt(strings[i]);
                if (base == 0) {
                    base = Integer.parseInt(strings[i]);
                } else {
                    power = Integer.parseInt(strings[i]);
                }

            } catch (NumberFormatException e) {
                continue;
            }
        }
        product = Math.pow(base, power);
        return in_string + " " + String.valueOf(product);

    }
}








