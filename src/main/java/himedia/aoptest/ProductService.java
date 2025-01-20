package himedia.aoptest;

import org.springframework.stereotype.Service;

@Service
public class ProductService {
	public ProductVo findProduct(String keyword) {
		System.out.println("finding [" +
				keyword + "] ...");
		if (keyword.equals("bomb")) {
			throw new RuntimeException("Boom!");
		}
		return new ProductVo(keyword);
	}
}