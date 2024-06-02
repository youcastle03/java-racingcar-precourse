package utils;

import static java.util.stream.Collectors.toList;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

public class Checker {
    public void carNameRangeCheck(List<String> names) {  //잘못 입력시 다시 시작해야하므로 StringCar네임 하나 만들것
        for (String name :names) {
            int length = name.length();
            if(length>5||length<1){
                throw new IllegalArgumentException("[ERROR]이름의 길이를 잘못 입력, 다시 입력해 주세요");
            }
        }
    }

    public void carNameDuplicationCheck(List<String> names){
        Set<String> set = new HashSet<>(names);
        if(names.size()>set.size()){
            throw new IllegalArgumentException("[ERROR]중복된 이름를 입력, 다시 입력해 주세요");
        }
    }
    public List<String> checkCarName(String carNames){
        List<String> names= Stream.of(carNames.split(",")).toList();
        carNameRangeCheck(names);
        carNameDuplicationCheck(names);
        return names;
    }
    public boolean isNumeric(String str) {
        if(!str.chars().allMatch(Character::isDigit)){
            throw new IllegalArgumentException("[ERROR]잘못된 숫자를 입력, 다시 입력해 주세요");
        }
        if(Integer.parseInt(str)<1){
            throw new IllegalArgumentException("[ERROR]0이하의 숫자를 입력, 다시 입력해 주세요");
        }
        return true;
    }
}
