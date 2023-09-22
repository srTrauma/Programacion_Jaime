package Programacion_Jaime.test_input;


class HelloWorld {
    public static void main(String[] args) {
        String[] addToList = input.userInput();
        list(addToListStringed(addToList));
    }

    public static String[] addToListStringed(String[] addToList) {
        String[] result = addToList;
        return result;
    };

    public static String[] list(String[] newElement) {

        String[] list = { "fiat", "ferrari", "lamborghini" };
        String[] fullList = newElement;

        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i]);
        }

        for (int i = 0; i < fullList.length; i++) {
            System.out.println(fullList[i]);
        }
        return list;
    }

}
