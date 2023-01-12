package by.academy.homework3;

public enum KindOfBread {

    TOAST_BREAD(1, "Тостовый"),BLACK_BREAD(2, "Бородинский"),WHITE_BREAD(3,"Минский");
    int index;
    String breadDesc;


    KindOfBread (int index, String breadDesc) {
        this.index = index;
        this.breadDesc = breadDesc;
    }

    @Override
    public String toString() {
        return "Kind of bread {" +
                "index=" + index +
                ", breadDesc='" + breadDesc + '\'' +
                '}';
    }

}
