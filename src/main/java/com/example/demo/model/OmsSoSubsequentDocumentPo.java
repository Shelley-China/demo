package com.example.demo.model;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * <p>
 * 
 * </p>
 *
 * @author zhangzhi8
 * @since 2023-02-08
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@AllArgsConstructor
@NoArgsConstructor
@TableName("oms_so_subsequent_document")
public class OmsSoSubsequentDocumentPo extends Model<OmsSoSubsequentDocumentPo> {
    private static final long serialVersionUID = 1L;

    public static final String FIELD_Id = "id";
    public static final String FIELD_SoNo = "so_no";
    public static final String FIELD_SoItemNo = "so_item_no";
    public static final String FIELD_EccSoNo = "ecc_so_no";
    public static final String FIELD_EccItemNo = "ecc_item_no";
    public static final String FIELD_EccQty = "ecc_qty";
    public static final String FIELD_EccSubPartNo = "ecc_sub_part_no";
    public static final String FIELD_EccSoDate = "ecc_so_date";
    public static final String FIELD_SubsequentDocNo = "subsequent_doc_no";
    public static final String FIELD_SubsequentDocItem = "subsequent_doc_item";
    public static final String FIELD_SubsequentDocType = "subsequent_doc_type";
    public static final String FIELD_SubsequentStatus = "subsequent_status";
    public static final String FIELD_SubsequentDate = "subsequent_date";
    public static final String FIELD_Warehouse = "warehouse";
    public static final String FIELD_PartNo = "part_no";
    public static final String FIELD_EtaDate = "eta_date";
    public static final String FIELD_TrackingNo = "tracking_no";
    public static final String FIELD_DeliveryQty = "delivery_qty";
    public static final String FIELD_DeliveredQty = "delivered_qty";
    public static final String FIELD_GoodsIssueNo = "goods_issue_no";
    public static final String FIELD_GoodsIssueItemNo = "goods_issue_item_no";
    public static final String FIELD_GoodsIssueDate = "goods_issue_date";
    public static final String FIELD_ShippedQty = "shipped_qty";
    public static final String FIELD_InvoiceNo = "invoice_no";
    public static final String FIELD_InvoiceItemNo = "invoice_item_no";
    public static final String FIELD_InvoicedQty = "invoiced_qty";
    public static final String FIELD_InvoiceAmount = "invoice_amount";
    public static final String FIELD_InvoiceDate = "invoice_date";
    public static final String FIELD_Currency = "currency";
    public static final String FIELD_PoNo = "po_no";
    public static final String FIELD_PoItem = "po_item";
    public static final String FIELD_PoDate = "po_date";
    public static final String FIELD_PoQty = "po_qty";
    public static final String FIELD_GrQty = "gr_qty";
    public static final String FIELD_RETURN_REFUND_STATUS = "return_refund_status";
    public static final String FIELD_RETURN_NO = "return_no";
    public static final String FIELD_RETURN_REQUEST_TIME = "return_request_time";
    public static final String FIELD_RETURN_DN_NO = "return_dn_no";
    public static final String FIELD_RETURN_CREDIT = "return_credit";
    public static final String FIELD_RETURN_QTY = "return_qty";
    public static final String FIELD_RETURN_VALUE = "return_value";
    public static final String FIELD_RETURN_VALUE_CURRENCY = "return_value_currency";
    public static final String FIELD_REFUND_CREDIT_REQUEST = "refund_credit_request";
    public static final String FIELD_REFUND_CREDIT_REQUEST_TIME = "refund_credit_request_time";
    public static final String FIELD_REFUND_CREDIT_ORDER = "refund_credit_order";
    public static final String FIELD_REFUND_QTY = "refund_qty";
    public static final String FIELD_REFUND_VALUE = "refund_value";
    public static final String FIELD_REFUND_VALUE_CURRENCY = "refund_value_currency";
    public static final String FIELD_CARRIER_CODE = "carrier_code";
    public static final String FIELD_CARRIER_NAME = "carrier_name";
    public static final String FIELD_EXIST_ZGLT_STATUS = "exist_zglt_status";
    public static final String FIELD_PUSH_FLASH = "push_flash";
    public static final String FIELD_ACTUAL_DELV_DATE = "actual_delv_date";
    public static final String FIELD_ACTUAL_DELV_TZ = "actual_delv_tz";
    public static final String FIELD_FulfillmentSystem = "fulfillment_system";
    public static final String FIELD_CreatedDate = "created_date";
    public static final String FIELD_CreatedBy = "created_by";
    public static final String FIELD_ChangedDate = "changed_date";
    public static final String FIELD_ChangedBy = "changed_by";

    public static final String FIELD_DELIVERY_STATUS = "delivery_status";
    public static final String FIELD_NET_PRICE = "net_price";


    @TableId(FIELD_Id)
    private String id;

    @TableField(FIELD_SoNo)
    private String soNo;

    @TableField(FIELD_SoItemNo)
    private String soItemNo;

    /**
     * SAP field = VBFA-VBELV
     */
    @TableField(FIELD_EccSoNo)
    private String eccSoNo;

    /**
     * SAP field = VBFA-POSNV
     */
    @TableField(FIELD_EccItemNo)
    private String eccItemNo;

    @TableField(FIELD_EccQty)
    private BigDecimal eccQty;

    @TableField(FIELD_EccSubPartNo)
    private String eccSubPartNo;

    @TableField(FIELD_EccSoDate)
    private Long eccSoDate;

    /**
     * SAP field = VBFA-VBELN
     */
    @TableField(FIELD_SubsequentDocNo)
    private String subsequentDocNo;

    /**
     * SAP field = VBFA-POSNN
     */
    @TableField(FIELD_SubsequentDocItem)
    private String subsequentDocItem;

    /**
     * SAP field = VBFA-VBTYP_N
     */
    @TableField(FIELD_SubsequentDocType)
    private String subsequentDocType;

    @TableField(FIELD_SubsequentStatus)
    private String subsequentStatus;

    @TableField(FIELD_SubsequentDate)
    private Long subsequentDate;

    @TableField(FIELD_Warehouse)
    private String warehouse;

    /**
     * SAP field = VBFA-MATNR
     */
    @TableField(FIELD_PartNo)
    private String partNo;

    @TableField(FIELD_EtaDate)
    private Long etaDate;

    /**
     * Get from other table
     */
    @TableField(FIELD_TrackingNo)
    private String trackingNo;

    /**
     * SAP field = VBFA-RFMNG for delivery (J)
     */
    @TableField(FIELD_DeliveryQty)
    private BigDecimal deliveryQty;

    @TableField(FIELD_DeliveredQty)
    private BigDecimal deliveredQty;

    @TableField(FIELD_GoodsIssueNo)
    private String goodsIssueNo;

    @TableField(FIELD_GoodsIssueItemNo)
    private String goodsIssueItemNo;

    @TableField(FIELD_GoodsIssueDate)
    private Long goodsIssueDate;

    /**
     * Use delivery (J) to find if goods movement doucment "R") exists, ie PGI
     */
    @TableField(FIELD_ShippedQty)
    private BigDecimal shippedQty;

    /**
     * SAP field = VBFA-RFMNG
     */
    @TableField(FIELD_InvoiceNo)
    private String invoiceNo;

    @TableField(FIELD_InvoiceItemNo)
    private String invoiceItemNo;

    /**
     * Use invoice (M)
     */
    @TableField(FIELD_InvoicedQty)
    private BigDecimal invoicedQty;

    /**
     * SAP field = VBFA-RFWRT
     */
    @TableField(FIELD_InvoiceAmount)
    private BigDecimal invoiceAmount;

    @TableField(FIELD_InvoiceDate)
    private Long invoiceDate;

    /**
     * SAP field = VBFA-WAERS
     */
    @TableField(FIELD_Currency)
    private String currency;

    @TableField(FIELD_PoNo)
    private String poNo;

    @TableField(FIELD_PoItem)
    private String poItem;

    @TableField(FIELD_PoDate)
    private Long poDate;

    @TableField(FIELD_PoQty)
    private BigDecimal poQty;

    @TableField(FIELD_GrQty)
    private BigDecimal grQty;
    
    @TableField(value = FIELD_RETURN_REFUND_STATUS)
    private String returnRefundStatus;
    
    @TableField(value = FIELD_RETURN_NO)
    private String returnNo;
    
    @TableField(value = FIELD_RETURN_REQUEST_TIME)
    private Long returnRequestTime;
    
    @TableField(value = FIELD_RETURN_DN_NO)
    private String returnDnNo;
    
    @TableField(value = FIELD_RETURN_CREDIT)
    private String returnCredit;
    
    @TableField(value = FIELD_RETURN_QTY)
    private Integer returnQty;
    
    @TableField(value = FIELD_RETURN_VALUE)
    private BigDecimal returnValue;
    
    @TableField(value = FIELD_RETURN_VALUE_CURRENCY)
    private String returnValueCurrency;
    
    @TableField(value = FIELD_REFUND_CREDIT_REQUEST)
    private String refundCreditRequest;
    
    @TableField(value = FIELD_REFUND_CREDIT_REQUEST_TIME)
    private Long refundCreditRequestTime;
    
    @TableField(value = FIELD_REFUND_CREDIT_ORDER)
    private String refundCreditOrder;
    
    @TableField(value = FIELD_REFUND_QTY)
    private Integer refundQty;
    
    @TableField(value = FIELD_REFUND_VALUE)
    private BigDecimal refundValue;
    
    @TableField(value = FIELD_REFUND_VALUE_CURRENCY)
    private String refundValueCurrency;

    @TableField(value = FIELD_CARRIER_CODE)
    private String carrierCode;

    @TableField(exist = false)
    private String adrnr;

    @TableField(value = FIELD_CARRIER_NAME)
    private String carrierName;

    @TableField(value = FIELD_EXIST_ZGLT_STATUS)
    private String existZgltStatus;

    @TableField(value = FIELD_PUSH_FLASH)
    private String pushFlash;

    @TableField(value = FIELD_ACTUAL_DELV_DATE)
    private Long actualDelvDate;

    @TableField(value = FIELD_ACTUAL_DELV_TZ)
    private String actualDelvTz;

    /**
     * SECC or CECC
     */
    @TableField(FIELD_FulfillmentSystem)
    private String fulfillmentSystem;

    @TableField(FIELD_CreatedDate)
    private Long createdDate;

    @TableField(FIELD_CreatedBy)
    private String createdBy;

    @TableField(FIELD_ChangedDate)
    private Long changedDate;

    @TableField(FIELD_ChangedBy)
    private String changedBy;

    @TableField(value = FIELD_DELIVERY_STATUS)
    private String deliveryStatus;

    @TableField(value = FIELD_NET_PRICE)
    private BigDecimal netPrice = new BigDecimal(0);


    @Override
    public Serializable pkVal() {
        return this.id;
    }
}
