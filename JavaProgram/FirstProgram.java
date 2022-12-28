
public class FirstProgram {
    static int result;
    public static void sum(int param1, int param2){
        result = param1 + param2;
        System.out.println("RESULT: " + result );


    }

    public static void main(String[] args) {
//sum(8, 10);
        calc(21, 3, "+");
        calc(21, 3, "-");
        calc(21, 3, "/");
        calc(21, 3, "*");
        calc(21, 3, "%");
    }

    static void calc(double param1, double param2, String operation){
      double result;
//        if(operation == "+"){
//            result = param1 + param2;
//            System.out.println("Результат операции: " + operation + "  равен:" + result);
//        }else if(operation == "-") {
//            result = param1 - param2;
//            System.out.println("Результат операции: " + operation + "  равен:" + result);
//
//        }else if(operation == "/") {
//            result = param1 / param2;
//            System.out.println("Результат операции: " + operation + "  равен:" + result);
//
//        }else if(operation == "*") {
//            result = param1 * param2;
//            System.out.println("Результат операции: " + operation + "  равен:" + result);
//        } else {
//            System.out.println("Извините, такой операции нет");
//        }
         switch (operation){
             case "+":
                 result = param1 + param2;
                 System.out.println("Результат операции: " + operation + "  равен:" + result);
                 break;
             case "-":
                 result = param1 - param2;
                 System.out.println("Результат операции: " + operation + "  равен:" + result);
                 break;
             case "/":
                 result = param1 / param2;
                 System.out.println("Результат операции: " + operation + "  равен:" + result);
                 break;
             case "*":
                 result = param1 * param2;
                 System.out.println("Результат операции: " + operation + "  равен:" + result);
                 break;
             default:
                 System.out.println("Извините, такой операции нет");
         }
    }
}
