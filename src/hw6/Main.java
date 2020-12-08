package hw6;

import hw6.animals.Cat;
import hw6.animals.Dog;

//1. Создать классы Собака и Кот с наследованием от класса Животное.
//
//2. Все животные могут бежать и плыть. В качестве параметра каждому методу передается
//   длина препятствия. Результатом выполнения действия будет печать в консоль.
//   (Например, dogBobik.run(150); -> 'Бобик пробежал 150 м.');
//
//3. У каждого животного есть ограничения на действия (бег: кот 200 м., собака 500 м.;
//  плавание: кот не умеет плавать, собака 10 м.).
public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog( "Собака",500,10 );
        Cat cat = new Cat( "Кот",200,0 );

        dog.run( 10 );
        dog.run( 1000 );
        dog.swim( 10 );
        dog.swim( 100 );
        cat.run( 10 );
        cat.run( 1000 );
        cat.swim( 10 );





    }
}
