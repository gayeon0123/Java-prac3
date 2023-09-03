package 객체지향문법3.com.example.LottoInterface;

public class LottoMachineMain {
    public static void main(String[] args) {

        // 변수가 45개 필요하다
        Ball[] balls = new Ball[45];

        for(int i = 0; i < LottoMachine.MAX_BALL_COUNT; i++) {
            balls[i] = new Ball(i + 1);
        }

        // LottoMachine 인스턴스가 생성된다
        LottoMachine lottoMachine = new LottoMachineImpl();

        lottoMachine.setBalls(balls);
        lottoMachine.mix();
        Ball[] result = lottoMachine.getBalls();

        for(int i = 0; i < result.length; i++) {
            System.out.println(result[i].getNumber());
        }
    }
}
