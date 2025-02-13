package cn.ant0n.gbm.infrastructure.dao.po;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    private Long id;
    private String productId;
    private String productName;
    private String modelType;
    private Integer usageCount;
    private BigDecimal price;
    private Date createTime;
    private Date updateTime;
}
