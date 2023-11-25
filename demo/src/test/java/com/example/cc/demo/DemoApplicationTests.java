package com.example.cc.demo;

import com.example.cc.demo.config.ResultVO;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;

@SpringBootTest
class DemoApplicationTests {

	@Test
	void contextLoads() {
		String s = "ss";
		ResultVO<String> resultVO = new ResultVO<>(s);

		// 冒泡排序
		int[] arr = {1, 3, 2, 5, 4};
		for (int i = 0; i < arr.length - 1; i++) {
			boolean flag = false;
			for (int j = 0; j < arr.length - 1 - i; j++) {
				int temp;
				if (arr[j] > arr[j + 1]) {
					flag = true;
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}

			if (!flag) {
				break;
			}
		}

		System.out.println(Arrays.toString(arr));


	}

}
