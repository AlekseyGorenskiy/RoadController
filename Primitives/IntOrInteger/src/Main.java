public class Main {
    public static void main(String[] args) {
        Container container = new Container();
        container.addCount(5672);
        System.out.println(container.getCount());
        for (int i=1040; i < 1104;i++) {
            char c = (char) i;
            System.out.println(i +"-"+ c);
        }
        int i = 1105;
        char c =(char)i;
        System.out.println(i+"-"+c);

        // TODO: char  ниже напишите код для выполнения задания:
        //  С помощью цикла и преобразования чисел в символы найдите все коды
        //  букв русского алфавита — заглавных и строчных, в том числе буквы Ё.

    }
}
