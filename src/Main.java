public class Main {
    public static void main(String[] args) {


        var box1 = 78.2;
        System.out.println(box1);
        var box2 = 82.7;
        System.out.println(box2);
        var ring = box1 + box2;
        System.out.println("Общий вес бойцов " + ring + "кг");
        var raznica = box2 - box1;
        System.out.println("Разница бойцов " + raznica + " кг");


        var bananas = 5;
        System.out.println("Количество бананов " + bananas);
        var ves1b = 80;
        System.out.println("Вес 1 банана " + ves1b + "грамм");
        var obananas = bananas * ves1b;
        System.out.println("Общий вес бананов " + obananas + "грамм");
        var milk = 200;
        System.out.println("Молоко " + milk + " мл");
        var mlgr = 105;
        System.out.println("100 мл равен " + mlgr + "грамм");
        var milkgr = mlgr * 2;
        System.out.println("Общее молоко в граммах " + mlgr * 2 + "грамм");
        var plombir = 2;
        System.out.println("Мороженное пломбир " + plombir + " брикета");
        var briket = 100;
        System.out.println("Один брикет равен  " + briket + " грамм");
        var plombirgr = briket * 2;
        System.out.println("Мороженное пломбир общее  " + plombirgr + " грамм");
        var egg = 4;
        System.out.println("Яиц всего " + egg + " шт");
        var egggr = 70;
        System.out.println("Одно яйцо весит " + egggr + " грамм");
        var oegggr = egg * egggr;
        System.out.println("Общий вес яиц " + oegggr + " грамм");
        float blender = obananas + milkgr + plombirgr + oegggr;
        System.out.println("Коктейль в блендере " + blender + " грамм");
        float kg = 1000;
        System.out.println("В одном киллограмме " + kg + " грамм");
        float coctel = blender / kg;
        System.out.println("Коктейль в блендере  " + coctel + " кг");

        var dieta = 7;
        System.out.println("Похудеть нужно на   " + dieta + " кг");
        var day1 = 250;
        System.out.println("Потеря в день   " + day1 + " грамм");
        var maxday1 = 500;
        System.out.println("Максимальная потеря в день   " + maxday1 + " грамм");
        var rashod = kg / day1;
        System.out.println("Сколько дней потребуется,чтоб похудеть на 1кг  при похудении 250 грамм в день   " + rashod + " дня");
        var maxrashod = kg / maxday1;
        System.out.println("Сколько дней потребуется,чтоб похудеть на 1кг при похудении 500 грамм в день   " + maxrashod + " дня");
        var itog1 = dieta * rashod;
        System.out.println("Сколько дней потребуется,чтоб похудеть на 7кг  при похудении 250 грамм в день   " + itog1 + " дня");
        var itog2 = dieta * maxrashod;
        System.out.println("Сколько дней потребуется,чтоб похудеть на 7кг  при похудении 500 грамм в день   " + itog2 + " дня");


        var masha = 67760;
        System.out.println("Зарплата Маши в месяц " + masha + " рублей");
        var denis = 83690;
        System.out.println("Зарплата Дениса в месяц " + denis + " рублей");
        var kristina = 76230;
        System.out.println("Зарплата Кристины в месяц " + kristina + " рублей");
        var premia = 10;
        System.out.println("Премия " + premia + " процентов в месяц");
        var god = 12;
        System.out.println("В году " + god + " месяцев");
        var zpmasha1 = masha * god;
        System.out.println("Зарплата Маши в год  " + zpmasha1 + " рублей");
        var zpdenis = denis * god;
        System.out.println("Зарплата Дениса в год  " + zpdenis + " рублей");
        var zpkristina = kristina * god;
        System.out.println("Зарплата Кристины в год  " + zpkristina + " рублей");
        var procent = 100;
        System.out.println("Сколько процентов в числе  " + procent);
        var premiachislo = procent / premia;
        System.out.println("Натуральное чиcло,после вычисления процентов   " + premiachislo);
        var premiamasha = zpmasha1 / premiachislo;
        System.out.println("В год зарплата Маши повысилась за счет премии на  " + premiamasha + " рублей");
        var ozpmashi = premiamasha + zpmasha1;
        System.out.println("Общая зарплата Маши за год,с учетом премии  " + ozpmashi + " рублей");
        var premiadenis = zpdenis / premiachislo;
        System.out.println("В год зарплата Дениса повысилась за счет премии на  " + premiadenis + " рублей");
        var ozpdenis = premiadenis + zpdenis;
        System.out.println("Общая зарплата Дениса за год,с учетом премии  " + ozpdenis + " рублей");
        var premiakristina = zpkristina / premiachislo;
        System.out.println("В год зарплата Кристины повысилась за счет премии на  " + premiakristina + " рублей");
        var ozpkristina = premiakristina + zpkristina;
        System.out.println("Общая зарплата Кристины за год,с учетом премии  " + ozpkristina + " рублей");

    }
}