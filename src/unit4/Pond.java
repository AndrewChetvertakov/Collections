package unit4;

public class Pond {
        Water water;
        public Pond(String color)
//public Pond()
//public Pond(Water water)
//public Water()

        {
            water = new Water(color);
        }
    }

    class Water {
        String color;
        public Water(String color){
            this.color = color;
        }
    }