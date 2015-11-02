package com.meizu.mop.cms.entity;

import java.math.BigDecimal;
import java.util.Date;

public class Order {
    private Long id;

    private String orderSn;

    private Integer userId;

    private BigDecimal totalPrice;

    private BigDecimal orderPrice;

    private Byte express;

    private BigDecimal expressPrice;

    private String expressId;

    private Byte status;

    private Byte refundStatus;

    private Byte payType;

    private Byte orderType;

    private String receiverTel;

    private String receiverName;

    private String receiverZipcode;

    private Integer receiverProvinceId;

    private Integer receiverCityId;

    private Integer receiverAreaId;

    private String receiverAddress;

    private String userRemark;

    private Byte invoiceType;

    private String invoiceTitle;

    private String invoiceContent;

    private Integer supplierId;

    private Boolean split;

    private Long parentOrderId;

    private String parentOrderSn;

    private Date divideTime;

    private Integer warehouseId;

    private Date createTime;

    private Byte source;

    private Byte ticket;

    private String transactionId;

    private String adminRemark;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOrderSn() {
        return orderSn;
    }

    public void setOrderSn(String orderSn) {
        this.orderSn = orderSn;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
    }

    public BigDecimal getOrderPrice() {
        return orderPrice;
    }

    public void setOrderPrice(BigDecimal orderPrice) {
        this.orderPrice = orderPrice;
    }

    public Byte getExpress() {
        return express;
    }

    public void setExpress(Byte express) {
        this.express = express;
    }

    public BigDecimal getExpressPrice() {
        return expressPrice;
    }

    public void setExpressPrice(BigDecimal expressPrice) {
        this.expressPrice = expressPrice;
    }

    public String getExpressId() {
        return expressId;
    }

    public void setExpressId(String expressId) {
        this.expressId = expressId;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public Byte getRefundStatus() {
        return refundStatus;
    }

    public void setRefundStatus(Byte refundStatus) {
        this.refundStatus = refundStatus;
    }

    public Byte getPayType() {
        return payType;
    }

    public void setPayType(Byte payType) {
        this.payType = payType;
    }

    public Byte getOrderType() {
        return orderType;
    }

    public void setOrderType(Byte orderType) {
        this.orderType = orderType;
    }

    public String getReceiverTel() {
        return receiverTel;
    }

    public void setReceiverTel(String receiverTel) {
        this.receiverTel = receiverTel;
    }

    public String getReceiverName() {
        return receiverName;
    }

    public void setReceiverName(String receiverName) {
        this.receiverName = receiverName;
    }

    public String getReceiverZipcode() {
        return receiverZipcode;
    }

    public void setReceiverZipcode(String receiverZipcode) {
        this.receiverZipcode = receiverZipcode;
    }

    public Integer getReceiverProvinceId() {
        return receiverProvinceId;
    }

    public void setReceiverProvinceId(Integer receiverProvinceId) {
        this.receiverProvinceId = receiverProvinceId;
    }

    public Integer getReceiverCityId() {
        return receiverCityId;
    }

    public void setReceiverCityId(Integer receiverCityId) {
        this.receiverCityId = receiverCityId;
    }

    public Integer getReceiverAreaId() {
        return receiverAreaId;
    }

    public void setReceiverAreaId(Integer receiverAreaId) {
        this.receiverAreaId = receiverAreaId;
    }

    public String getReceiverAddress() {
        return receiverAddress;
    }

    public void setReceiverAddress(String receiverAddress) {
        this.receiverAddress = receiverAddress;
    }

    public String getUserRemark() {
        return userRemark;
    }

    public void setUserRemark(String userRemark) {
        this.userRemark = userRemark;
    }

    public Byte getInvoiceType() {
        return invoiceType;
    }

    public void setInvoiceType(Byte invoiceType) {
        this.invoiceType = invoiceType;
    }

    public String getInvoiceTitle() {
        return invoiceTitle;
    }

    public void setInvoiceTitle(String invoiceTitle) {
        this.invoiceTitle = invoiceTitle;
    }

    public String getInvoiceContent() {
        return invoiceContent;
    }

    public void setInvoiceContent(String invoiceContent) {
        this.invoiceContent = invoiceContent;
    }

    public Integer getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(Integer supplierId) {
        this.supplierId = supplierId;
    }

    public Boolean getSplit() {
        return split;
    }

    public void setSplit(Boolean split) {
        this.split = split;
    }

    public Long getParentOrderId() {
        return parentOrderId;
    }

    public void setParentOrderId(Long parentOrderId) {
        this.parentOrderId = parentOrderId;
    }

    public String getParentOrderSn() {
        return parentOrderSn;
    }

    public void setParentOrderSn(String parentOrderSn) {
        this.parentOrderSn = parentOrderSn;
    }

    public Date getDivideTime() {
        return divideTime;
    }

    public void setDivideTime(Date divideTime) {
        this.divideTime = divideTime;
    }

    public Integer getWarehouseId() {
        return warehouseId;
    }

    public void setWarehouseId(Integer warehouseId) {
        this.warehouseId = warehouseId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Byte getSource() {
        return source;
    }

    public void setSource(Byte source) {
        this.source = source;
    }

    public Byte getTicket() {
        return ticket;
    }

    public void setTicket(Byte ticket) {
        this.ticket = ticket;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public String getAdminRemark() {
        return adminRemark;
    }

    public void setAdminRemark(String adminRemark) {
        this.adminRemark = adminRemark;
    }
}