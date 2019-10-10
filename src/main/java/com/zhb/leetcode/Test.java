package com.zhb.leetcode;

import com.alibaba.fastjson.JSON;

/**
 * @Author: Zhang Hengbo
 * @CreateTime: 2019/10/10 19:09
 * @Description:
 */
public class Test {

    public static void main(String[] args) {
        //#66
        pushOneTest();
    }

    public static void pushOneTest() {
        System.out.println(JSON.toJSONString(Solution.plusOne(new int[]{9,9})));
        System.out.println(JSON.toJSONString(Solution.plusOne(new int[]{1,9})));
    }
}
