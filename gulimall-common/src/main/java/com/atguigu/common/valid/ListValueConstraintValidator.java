package com.atguigu.common.valid;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.HashSet;
import java.util.Set;

/**
 * @author Emma_Lyy
 * @create 2022-09-27 0:52
 */
public class ListValueConstraintValidator implements ConstraintValidator<ListValue,Integer> {

    private Set<Integer> set = new HashSet<Integer>();
    //初始化方法
    @Override
    public void initialize(ListValue constraintAnnotation) {
        int[] vals = constraintAnnotation.vals();
        for(int val:vals){
            set.add(val);
        }
    }

    //判断是否校验成功

    /**
     *
     * @param value 需要校验的值
     * @param context 整个校验的上下文环境信息
     * @return
     */
    @Override
    public boolean isValid(Integer value, ConstraintValidatorContext context) {
        //这里面的形参value就是需要校验的值，要判断它是否满足上面initialize
        return set.contains(value);
    }
}
