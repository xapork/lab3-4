package Main;

import java.time.LocalDate;
import java.util.List;

import ball.*;
import ball.enviroment.*;
import characters.*;
import exception.GlassBreakingException;

public class Main {

    public static void main(String[] args) {

        Malysh malysh = new Malysh("Винтик");
        malysh.addWork(new Work("Установить фонари"));

        Malyshki malyshki = new Malyshki("Малышки");
        malyshki.addFlowers(new Flowers("Ромашка", "белый"));
        malyshki.addDecorating(new Decorating("Фонарики", "золотая"));

        Tubik tubik = new Tubik();
        tubik.addPattern(new Pattern("Цветочный", 8));
        tubik.addPattern(new Pattern("Музыкальный", 6));

        Gvozdik gvozdik = new Gvozdik();

        DanceFloor floor = new DanceFloor("большая");
        Tent tent = new Tent("синяя");

        Pavilion pavilion = new Pavilion();
        pavilion.построить();
        pavilion.бытьРасписанной(tubik);
        pavilion.принятьОркестр();

        handleGvozdik(gvozdik);

        Korotysh shurupchik = createFoundKorotysh("Шурупчик");
        Korotysh bublik = createFoundKorotysh("Бублик");

        List<Citizen> citizens = List.of(
                malysh,
                malyshki,
                tubik,
                gvozdik
        );

        System.out.println("\n Шурупчик и Бублик найдены!\n");
        citizens.forEach(c -> {
            c.reactToFound(shurupchik);
            c.reactToFound(bublik);
        });

        PrepForBall ball = new PrepForBall(
                List.of(floor, tent, malyshki, malysh)
        );
        ball.start();

        InfAboutBall info = new InfAboutBall(
                LocalDate.now(),
                "Цветочный город",
                "18:00",
                ball.getReadiness()
        );

        System.out.println("\n" + info);
    }

    private static void handleGvozdik(Gvozdik gvozdik) {
        System.out.println("\n Проверка Гвоздика");
        System.out.println("Статус Гвоздика: " + gvozdik.getStatus());

        try {
            gvozdik.битьСтекла();
        } catch (GlassBreakingException e) {
            System.out.println("Поймано исключение: " + e.getMessage());
        }

        gvozdik.setStatus(Status.REEDUCATED);
        System.out.println("Статус Гвоздика восстановлен: " + gvozdik.getStatus());
    }

    private static Korotysh createFoundKorotysh(String name) {
        Korotysh korotysh = new Korotysh(name) {
            @Override
            public void doSmt() {}
        };
        korotysh.setStatus(Status.FOUND);
        return korotysh;
    }
}
