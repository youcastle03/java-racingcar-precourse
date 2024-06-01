package domain;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Checker {
    public void carNameRangeCheck(List<String> names) {  //잘못 입력시 다시 시작해야하므로 StringCar네임 하나 만들것
        for (String name :names) {
            int length = name.length();
            if(length>5||length<1){
                throw new IllegalArgumentException("이름의 길이를 잘못 입력");
            }
        }
    }

    public void carNameDuplicationCheck(List<String> names){
        Set<String> set = new HashSet<>(names);
        if(names.size()>set.size()){
            throw new IllegalArgumentException("중복된 이름를 입력");
        }
    }
}
