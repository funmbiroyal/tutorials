package Chapter7Test;

public enum Suit2 {
        TRIANGLES, CROSSES, SQUARES, CIRCLES,STARS,WHOT;


        @Override
        public String toString() {

            switch (this){
                case CIRCLES: return "Diamond";
                case CROSSES: return "Spade";
                case TRIANGLES: return "Heart";
                case SQUARES:  return "Club";
                default:return null;
            }
//        return switch (this){
//            case CLUB -> "Club";
//            case HEART -> "Heart";
//            case SPADE -> "Spade";
//            case DIAMOND -> "Diamond";
//        };
        }
    }

}
