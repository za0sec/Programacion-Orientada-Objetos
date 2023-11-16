package Parciales.P2.Par2_21_01.Ej2;

public enum ProductCategory {
    BOOKS{
        @Override
        public double calculatePoints(double points){
            return (points * 0) + 30;
        }
    },
    ELECTRONICS{
        @Override
        public double calculatePoints(double points){
            return (points * 1.10) + 80;
        }
    },
    GROCERY{
        @Override
        public double calculatePoints(double points){
            return (points * 1.25) + 5;
        }
    };

    public abstract double calculatePoints(double points);

}
