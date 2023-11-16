package Parciales.P2.Par2_21_02.Ej2;

public enum Membership {

    BEGINNER{
        @Override
        public boolean canEnter(int visits) {
            return 4 - visits > 0;
        }
    },
    ADVANCED{
        @Override
        public boolean canEnter(int visits) {
            return 8 - visits > 0;
        }
    },
    PRO{
        @Override
        public boolean canEnter(int visits) {
            return true;
        }
    };

    public abstract boolean canEnter(int visits);


}
