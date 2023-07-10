package seminar_tasks.seminar6;

public class Cat {
    // 📔 1. Продумайте структуру класса Кот. Какие поля и методы будут актуальны для приложения, которое является
    // а) информационной системой ветеринарной клиники
    // б) архивом выставки котов
    // в) информационной системой Театра кошек Ю. Д. Куклачёва
    // Можно записать в текстовом виде, не обязательно реализовывать в java.
    // 📔 1. Реализуйте 1 из вариантов класса Cat из предыдущего задания, можно использовать не все придуманные поля и методы. Создайте несколько экземпляров этого класса, выведите их в консоль.
    // 2. Добейтесь того, чтобы при выводе в консоль объекта типа Cat, выводилась его кличка, цвет и возраст (или другие параметры на ваше усмотрение).
    
    private String name;
    private String owner;
    private String breed;
    private int age;
    // private List<String> healthHistory;

    public Cat(String name, String owner, String breed, int age){
        this.name = name;
        this.owner = owner;
        this.breed = breed;
        this.age = age;
    }

    public String getName(){
        return name;
    }
    
    public String getOwner(){
        return owner;
    }
    
    public String getBreed(){
        return breed;
    }
    
    public int getAge(){
        return age;
    }

    @Override
    public String toString(){
        return "name : " + name + " owner : " + owner + " breed : " + breed + " age : " + age;
    }

    @Override
    public boolean equals(Object o){
        if(this == o) return true; //проверка равенства ссылок
        if(!(o instanceof Cat)) return false; //проверка принадлежности объекта к классу Cat
        Cat cat = (Cat)o;
        return name.equals(cat.name) && age == cat.age && owner.equals(cat.owner) && breed.equals(cat.breed);
    }

    @Override
    public int hashCode(){
        return 6*name.hashCode() + 12*age + 3*breed.hashCode() + 8*owner.hashCode(); //домножение для того чтобы хэшкод не совпадал с другими
    }


}
