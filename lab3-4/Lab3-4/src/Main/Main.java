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

        DanceFloor floor = new DanceFloor("большая");
        Tent tent = new Tent("синяя");
        
        Tubik tubik = new Tubik();
        tubik.addPattern(new Pattern("Цветочный", 8));
        tubik.addPattern(new Pattern("Музыкальный", 6));

        Pavilion pavilion = new Pavilion();
        pavilion.построить();
        pavilion.бытьРасписанной(tubik);
        pavilion.принятьОркестр();

        Gvozdik gvozdik = new Gvozdik();
        
        System.out.println("\n Проверка Гвоздика ");
        System.out.println("Статус Гвоздика: " + gvozdik.setStatus());
        
        try {
            gvozdik.битьСтекла();
            System.out.println("Гвоздик попытался бить стекла...");
        } catch (GlassBreakingException e) {
            System.out.println("Поймано исключение: " + e.getMessage());
            System.out.println("Гвоздик оказался перевоспитанным!");
        }
        
        System.out.println("\n Изменяем статус Гвоздика ");
        gvozdik.setStatus(null); 
        
        try {
            gvozdik.битьСтекла();
        } catch (GlassBreakingException e) {
            System.out.println("Поймано исключение: " + e.getMessage());
        }
        
        gvozdik.setStatus(Status.REEDUCATED);
        System.out.println("Статус Гвоздика восстановлен: " + gvozdik.setStatus());

        Citizen shurupchik = new Citizen("Шурупчик") {
            @Override
            public void doSmt() {}
        };

        Citizen bublik = new Citizen("Бублик") {
            @Override
            public void doSmt() {}
        };
        shurupchik.setStatus(Status.FOUND);
        bublik.setStatus(Status.FOUND);
        
        List<Citizen> citizens = List.of(
                malysh,
                malyshki,
                tubik,
                gvozdik 
        );

        System.out.println("\nШурупчик и Бублик найдены! Все жители радуются:\n");

        for (Citizen citizen : citizens) {
            citizen.reactToFound(shurupchik);
            citizen.reactToFound(bublik);
        }

        PrepForBall ball = new PrepForBall(
                List.of(floor, tent, malyshki, malysh)
        );

        ball.start();

        InfAboutBall инфо = new InfAboutBall(
                LocalDate.now(),
                "Цветочный город",
                "18:00",
                ball.getReadiness()
        );

        System.out.println("\n" + инфо);
        
        System.out.println("\n на всякий ");
        System.out.println("Гвоздик что-то делает:");
        gvozdik.doSmt();
        
        System.out.println("Гвоздик перевоспитан? " + gvozdik.isReeducated());
        System.out.println("\nГвоздик снова пытается бить стекла...");
        try {
            gvozdik.битьСтекла();
        } catch (GlassBreakingException e) {
            System.out.println("Результат: " + e.getMessage());
        }
    }
}