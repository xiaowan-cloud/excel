package wan.com.templateproject.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author wan
 * @version 1.0.0
 * @Description people实体
 * @createTime 2021年08月17日 14:03:44
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class People {
    private int id;
    private String name;
    private int age;
    //0:男,1:女
    private int gender;
    private String hobby;
}
