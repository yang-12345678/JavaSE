package homework;

public class HomeWork01 {
    public static void main(String[] args) {

        try {
            // 验证参数个数是否则正确
            if(args.length != 2) {
                throw new ArrayIndexOutOfBoundsException("参数个数不对");
            }

            // 先把接收到的参数转换为整数
            int n1 = Integer.parseInt(args[0]);
            int n2 = Integer.parseInt(args[1]);

            double res = cal(n1, n2);
            System.out.println("计算结果是：" + res);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("参数类型不对，需要输入整数");
        } catch (ArithmeticException e) {
            System.out.println("出现了除 0 异常");
        }

    }

    public static double cal(int n1, int n2) {
        return n1 / n2;
    }
}

