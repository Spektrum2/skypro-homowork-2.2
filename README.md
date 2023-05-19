# 2.2 ООП часть 1. Инкапсуляция и наследование
## 1 задание

В школе магии и волшебства Хогвартс есть четыре факультета: 

- Гриффиндор
- Пуффендуй
- Когтевран
- Слизерин

Студентам каждого из этих факультетов присущи свои свойства характера. Эти свойства оцениваются в целочисленном эквиваленте от 0 до 100. 

Всем Гриффиндорцам присущи благородство, честь и храбрость. 

Студенты Пуффендуя трудолюбивы, верны, честны.

Когтевранцы умны, мудры, остроумны и полны творчества. 

Всем ученикам Слизерина присущи хитрость, решительность, амбициозность, находчивость и жажда власти.

Абсолютно все ученики школы Хогвартс умеют колдовать с мощностью в сколько-то баллов и могут трансгрессировать на какое-то расстояние. Сила магии и расстояние трансгресии у каждого ученика своё и выражается в целочисленном эквиваленте. 

Гарри Поттер, Гермиона Грейнджер и Рон Уизли учатся на факультете Гриффиндор.  

Драко Малфой, Грэхэм Монтегю, Грегори Гойл учатся на Слизерине. 

На факультет Пуффендуй учатся Захария Смит, Седрик Диггори, Джастин Финч-Флетчли. 

На факультете Когтевран учится Чжоу Чанг, Падма Патил и Маркус Белби. 

Напишите программу, в которой реализован класс hogwarts и четыре класса по названиям факультетов. В классах факультетов опишите свойства каждого, перечисленные выше. Ученики должны быть реализованы в качестве объектов. Должна быть возможность задавать качества учеников через конструктор. Присвойте каждому свойству произвольное числовое значение от 0 до 100.  

Сделайте метод, который выводит на экран описание студента. В описание надо включать качества, которые присущи всем студентам, плюс качества, которые присущи студенту, потому что он учится на конкретном факультете. 

Реализуйте 4 метода, по одному для каждого факультета, которые сравнивают между собой учеников одного факультета по свойствам. У каждого ученика нужно сложить баллы по каждому свойству, которое присуще ученику данного факультета. 

Тот ученик, у которого сумма свойств больше, считается лучшим учеником. 

Метод должен выводить в консоль сравнение учеников.

Например, у Гермионы благородство = 5 баллов, честь = 5 баллов и храбрость = 6 баллов. У Рона Уизли благородство = 3 балла, честь = 6 баллов и храбрость = 5 баллов.

У Гермионы сумма баллов равна 16-ти, а у Рона – 14-ти. Значит метод должен вывести в консоль “Гермиона лучший Гриффиндорец, чем Рон”. 

Реализуйте метод, который сравнивает двух любых учеников Хогвартса по силе магии и расстоянию трансгрессии, и выводит в консоль сравнительную оценку между двумя учениками. 

Например, Драко Малфой обладает бОльшей мощностью магии, чем Захария Смит. 

Важно: поля объектов должны быть приватными.

# 2.2. ООП часть 2. Интерфейсы и полиморфизм

Ниже вам даны несколько блоков кода. Ваша задача — поправить код так, чтобы он учитывал изученные принципы ООП. 

Здесь нет сложного и простого уровня, вам необходимо поправить все блоки кода. Выполненное задание присылайте ссылкой на проект на GitHub.
> 

### Обязательные для выполнения блоки кода

- 1-й блок кода. Пример с велосипедом
    
    ```java
    public class Bicycle {
    
        public String modelName;
        public int wheelsCount;
    
        public void updateTyre() {
            System.out.println("Меняем покрышку");
        }
    }
    ```
    
    Файл с кодом: 
    
    [Bicycle.java](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/3bb550a5-1e81-4f8c-8075-f4a1f1aa3fbd/Bicycle.java)
    
- 2-й блок кода. Пример с машиной
    
    ```java
    public class Car {
    
        public String modelName;
        public int wheelsCount;
    
        public void updateTyre() {
            System.out.println("Меняем покрышку");
        }
    
        public void checkEngine() {
            System.out.println("Проверяем двигатель");
        }
    }
    ```

    
- 3-й блок кода. Пример с сервисной станцией
    
    ```java
    public class ServiceStation {
        public void check(Car car, Bicycle bicycle, Truck truck) {
            if (car != null) {
                System.out.println("Обслуживаем " + car.modelName);
                for (int i = 0; i < car.wheelsCount; i++) {
                    car.updateTyre();
                }
                car.checkEngine();
            } else if (truck != null) {
                System.out.println("Обслуживаем " + truck.modelName);
                for (int i = 0; i < truck.wheelsCount; i++) {
                    truck.updateTyre();
                }
                truck.checkEngine();
                truck.checkTrailer();
            } else if (bicycle != null) {
                System.out.println("Обслуживаем " + bicycle.modelName);
                for (int i = 0; i < bicycle.wheelsCount; i++) {
                    bicycle.updateTyre();
                }
            }
        }
    }
    ```
    
- 4-й блок кода. Пример с грузовой машиной
    
    ```java
    public class Truck {
    
        public String modelName;
        public int wheelsCount;
    
        public void updateTyre() {
            System.out.println("Меняем покрышку");
        }
    
        public void checkEngine() {
            System.out.println("Проверяем двигатель");
        }
    
        public void checkTrailer() {
            System.out.println("Проверяем прицеп");
        }
    }
    ```
    
- 5-й блок кода. Общий пример
```java
public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        Car car2 = new Car();
        car.modelName = "car1";
        car2.modelName = "car2";
        car.wheelsCount = 4;
        car2.wheelsCount = 4;

        Truck truck = new Truck();
        Truck truck2 = new Truck();
        truck.modelName = "truck1";
        truck2.modelName = "truck2";
        truck.wheelsCount = 6;
        truck2.wheelsCount = 8;

        Bicycle bicycle = new Bicycle();
        Bicycle bicycle2 = new Bicycle();
        bicycle.modelName = "bicycle1";
        bicycle2.modelName = "bicycle2";
        bicycle.wheelsCount = 2;
        bicycle2.wheelsCount = 2;

        ServiceStation station = new ServiceStation();
        station.check(car, null, null);
        station.check(car2, null, null);
        station.check(null, bicycle, null);
        station.check(null, bicycle2, null);
        station.check(null, null, truck);
        station.check(null, null, truck2);
    }
}
```
