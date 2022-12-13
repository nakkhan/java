package Assignment1;

public class switch_case {
        public static void main(String[] args) {

            int number = 10;
            String size;

            switch (number) {
                case 0:
                    size = "Small";
                    break;

                case 5:
                    size = "Medium";
                    break;

                case 10:
                    size = "Large";
                    break;

                case 12:
                    size = "Extra Large";
                    break;

                default:
                    size = "Unknown";
                    break;

            }
            System.out.println("Size: " + size);
        }
    }