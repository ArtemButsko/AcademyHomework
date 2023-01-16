package by.academy.homework5;

import java.time.Duration;
import java.time.Instant;
import java.util.*;

public class App {

    private static Random randomElement = new Random();

    public static void main(String[] args) {


// Task 1
        ArrayList numList = new ArrayList();

        numList.add(5);
        numList.add(5);
        numList.add(1);
        numList.add(1);

        System.out.println(numList.toString());

        Set setList = new HashSet(numList);
        numList.clear();
        numList.add(setList);

        System.out.println(numList.toString());

//Task 2

        int j = 1;

        ArrayList<Integer> arrList = new ArrayList();
        LinkedList<Integer> linkList = new LinkedList();

        Instant startAddArrayList = Instant.now();

        for (int i = 0; i < 1000000; i++) {

            arrList.add(j);
            j++;

        }

        Instant finishAddArrayList = Instant.now();

        System.out.println("Время выполнения добавления элементов ArrayList: " + Duration.between(startAddArrayList, finishAddArrayList).toMillis());

        Instant startAddLinkedList = Instant.now();

        for (int i = 0; i < 1000000; i++) {

            linkList.add(j);
            j++;

        }
        Instant finishAddLinkedList = Instant.now();

        System.out.println("Время выполнения добавления элементов LinkedList: " + Duration.between(startAddLinkedList, finishAddLinkedList).toMillis());

        Instant startArrayList = Instant.now();

        for (int i = 0; i < 100000; i++) {

            int element = randomElement.nextInt(arrList.size());
        }

        Instant finishArrayList = Instant.now();

        System.out.println("Время выбора случайного элемента из ArrayList: " + Duration.between(startArrayList, finishArrayList).toMillis());

        Instant startLinkedList = Instant.now();

        for (int i = 0; i < 100000; i++) {

            int element = randomElement.nextInt(linkList.size());
        }

        Instant finishLinkedList = Instant.now();

        System.out.println("Время выбора случайного элемента из ArrayList: " + Duration.between(startLinkedList, finishLinkedList).toMillis());


//Task 3

        Integer[][] arr = new Integer[2][2];

        for (int i = 0; i < arr.length; i++) {

            for (int e = 0; e < arr[i].length; e++) {

                arr[i][e] = randomElement.nextInt(arr.length);
            }
        }

        System.out.println(Arrays.deepToString(arr));

        CustomArrayIterator<Integer> customArrIterator = new CustomArrayIterator<>(arr);

        try {
            while (customArrIterator.hasNext()) {
                System.out.print(customArrIterator.next() + " ");
            }
        } catch (ArrayIndexOutOfBoundsException e) {

        }
        System.out.println();

//Task 4

        ArrayList<Integer> marks = new ArrayList<>();

        for (int i = 0; i < 14; i++) {

            marks.add(randomElement.nextInt(10));

        }

        System.out.println("Marks: " + marks.toString());

        int maxMark = 0;
        int countMark = 0;

        Iterator<Integer> markIterator = marks.iterator();

        while (markIterator.hasNext()) {

            if ((countMark = markIterator.next()) > maxMark) {
                maxMark = countMark;

            }

        }

        System.out.println("max mark: " + maxMark);

// Task 5

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите текст: ");

        String text = sc.next();
        sc.close();

        char[] ch = text.toCharArray();

        Map<Character, Integer> map = new HashMap<>();

        for (char chars : ch) {
            if (map.keySet().contains(chars)) {
                map.put(chars, map.get(chars) + 1);
            } else {
                map.put(chars, 1);
            }

        }
        //System.out.println(map);

        ArrayList<Map.Entry<Character, Integer>> entries = new ArrayList<>(map.entrySet());

        Collections.sort(entries, new Comparator<Map.Entry<Character, Integer>>() {
            @Override
            public int compare(Map.Entry<Character, Integer> o1, Map.Entry<Character, Integer> o2) {
                return (o1.getValue()).compareTo(o2.getValue());
            }

        });

        for (Map.Entry<Character, Integer> entry : entries) {
            System.out.print(entry.getKey() + " " + entry.getValue() + " /");
        }

        System.out.println();


// Task 6

        Integer[] exceptionArr = new Integer[8];

        try {
            for (int i = 0; i < 10; i++) {
                exceptionArr[i] = randomElement.nextInt(100);

            }
            System.out.println(Arrays.toString(exceptionArr));

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array is to small, expand the array");
        }


    }
}





