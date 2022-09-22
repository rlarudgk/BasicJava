package asdf;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class StudentTest {
    public static void main(String[] args) {

        ArrayList<StudentList> list = new ArrayList<StudentList>();

        list.add(new StudentList("10001", "김경하", 100, 100, 100));
        list.add(new StudentList("10005", "서범수", 100, 90, 95));
        list.add(new StudentList("10003", "김소현", 90, 85, 100));
        list.add(new StudentList("10004", "전혜연", 80, 95, 100));
        list.add(new StudentList("10002", "김예슬", 75, 60, 45));
        list.add(new StudentList("10006", "이정우", 95, 90, 90));

        // 랭킹 구하기
        for (int i = 0; i < list.size(); i++) {
            int rank = 1;
            for (int j = 0; j < list.size(); j++) {
                if (i != j) {
                    if (list.get(i).getScore() < list.get(j).getScore()) {
                        rank++;
                    }
                }
                list.get(i).setRank(rank);
            }
        }
        // <<---- 랭킹 구하기

        System.out.println("정렬 전: ");
        for (StudentList mem : list) {
            System.out.println(mem);
        }
        System.out.println("--------------------------");

        Collections.sort(list);
        System.out.println("총점의 오름차순으로 정렬 후 : ");
        for (StudentList mem : list) {
            System.out.println(mem);
        }
        System.out.println("--------------------------");

        Collections.sort(list, new SortNumDesc());
        System.out.println("총점의 내림차순으로 정렬 후 : ");
        for (StudentList mem : list) {
            System.out.println(mem);
        }
        System.out.println("--------------------------");
    }
}

class SortNumDesc implements Comparator<StudentList> {

    @Override
    public int compare(StudentList mem1, StudentList mem2) {
        if (mem1.getScore() > mem2.getScore()) {
            return -1;
        } else if (mem1.getScore() < mem2.getScore()) {
            return 1;
        } else {
            //점수가 같으면 학번을 비교해서 내림차로
//			if(mem1.getScore() == mem2.getScore()) {
//				Collections.sort(list, new SortNumDesc());
//			}

            return -1;
        }
    }
}



