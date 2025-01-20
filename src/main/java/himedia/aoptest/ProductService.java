package himedia.aoptest;

import org.springframework.stereotype.Service;

@Service
public class ProductService {

	public ProductVo findProduct(String keyword) {
		System.out.println("finding [" + keyword + "] ...");

		return new ProductVo(keyword);
	}
}
