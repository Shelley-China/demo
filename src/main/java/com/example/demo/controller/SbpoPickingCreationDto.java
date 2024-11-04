package com.example.demo.controller;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

public class SbpoPickingCreationDto {

    private static final long serialVersionUID = 1L;

    private Long id;

    private String outboundDoNo;

    private String outboundDoItem;

    private String documentType;

    private String refDocNo;

    private String refDocItem;

    private String pickingGroup;

    private String pickingGroupItem;

    private String outboundDoItemStatus;

    private String warehouse;

    private String location;

    private String storageArea;

    private String binNo;

    private String extWarehouse;

    private String extLocation;

    private String partNo;

    private String extPartNo;

    private String serialNo;

    private BigDecimal quantity;

    private String uom;

    private String pickingStatus;

    private Long pickingTimestamp;

    private String packingStatus;

    private BigDecimal packingQty;

    private Long shipToAddressId;

    private Long soldToAddressId;

    private String shipToId;

    private String shipToName1;

    private String shipToName2;

    private String shipToCtry;

    private String shortName;

    private String soldToId;

    private String soldToName1;

    private String soldToName2;

    private String soldToCtry;

    private String recIssueWh;

    private String recIssueLoc;

    private String recStorageArea;

    private String recBinNo;

    private String receivingPartNo;

    private String receivingUom;

    private String addressSearchField;

    private String businessType;

    private String etaServiceLevel;

    private Long etaDate;

    private String etaTimeZone;

    private String businessTypeDescription;

    private String crmServiceTypeDescription;

    private String soid;

    private String soNo;

    private String soItem;

    private String createdBy;

    private Long createdDate;

    private String changedBy;

    private Long changedDate;

    private Integer deleteFlag;

    private Integer finishFlag;

    private String crmServiceLevel;

    private Long dnCreatedDate;

    private String dnCreatedDateStr;

    private String partName;

    private String remark;

    private String serviceOrderNo;

    private String addressStr;

    private String shipToIdStr;

    private String project;

    private String crmPriority;

    private String endCustomerName;

    private String fsEngineer;


    public String getShipToIdStr() {
        return shipToIdStr;
    }

    public void setShipToIdStr(String shipToIdStr) {
        this.shipToIdStr = shipToIdStr;
    }

    public String getSoNo() {
        return soNo;
    }

    public void setSoNo(String soNo) {
        this.soNo = soNo;
    }

    public String getSoItem() {
        return soItem;
    }

    public void setSoItem(String soItem) {
        this.soItem = soItem;
    }

    public String getDnCreatedDateStr() {
        return dnCreatedDateStr;
    }

    public void setDnCreatedDateStr(String dnCreatedDateStr) {
        this.dnCreatedDateStr = dnCreatedDateStr;
    }

    public String getPartName() {
        return partName;
    }

    public void setPartName(String partName) {
        this.partName = partName;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getServiceOrderNo() {
        return serviceOrderNo;
    }

    public void setServiceOrderNo(String serviceOrderNo) {
        this.serviceOrderNo = serviceOrderNo;
    }

    public String getAddressStr() {
        return addressStr;
    }

    public void setAddressStr(String addressStr) {
        this.addressStr = addressStr;
    }

    public String getExtLocation() {
        return extLocation;
    }

    public void setExtLocation(String extLocation) {
        this.extLocation = extLocation;
    }

    public String getPartNo() {
        return partNo;
    }

    public void setPartNo(String partNo) {
        this.partNo = partNo;
    }

    public String getExtPartNo() {
        return extPartNo;
    }

    public void setExtPartNo(String extPartNo) {
        this.extPartNo = extPartNo;
    }

    public String getSerialNo() {
        return serialNo;
    }

    public void setSerialNo(String serialNo) {
        this.serialNo = serialNo;
    }

    public BigDecimal getQuantity() {
        return quantity;
    }

    public void setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
    }

    public String getUom() {
        return uom;
    }

    public void setUom(String uom) {
        this.uom = uom;
    }

    public String getPickingStatus() {
        return pickingStatus;
    }

    public void setPickingStatus(String pickingStatus) {
        this.pickingStatus = pickingStatus;
    }

    public Long getPickingTimestamp() {
        return pickingTimestamp;
    }

    public void setPickingTimestamp(Long pickingTimestamp) {
        this.pickingTimestamp = pickingTimestamp;
    }

    public String getPackingStatus() {
        return packingStatus;
    }

    public void setPackingStatus(String packingStatus) {
        this.packingStatus = packingStatus;
    }

    public BigDecimal getPackingQty() {
        return packingQty;
    }

    public void setPackingQty(BigDecimal packingQty) {
        this.packingQty = packingQty;
    }

    public Long getShipToAddressId() {
        return shipToAddressId;
    }

    public void setShipToAddressId(Long shipToAddressId) {
        this.shipToAddressId = shipToAddressId;
    }

    public Long getSoldToAddressId() {
        return soldToAddressId;
    }

    public void setSoldToAddressId(Long soldToAddressId) {
        this.soldToAddressId = soldToAddressId;
    }

    public String getShipToId() {
        return shipToId;
    }

    public void setShipToId(String shipToId) {
        this.shipToId = shipToId;
    }

    public String getShipToName1() {
        return shipToName1;
    }

    public void setShipToName1(String shipToName1) {
        this.shipToName1 = shipToName1;
    }

    public String getShipToName2() {
        return shipToName2;
    }

    public void setShipToName2(String shipToName2) {
        this.shipToName2 = shipToName2;
    }

    public String getShipToCtry() {
        return shipToCtry;
    }

    public void setShipToCtry(String shipToCtry) {
        this.shipToCtry = shipToCtry;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public String getSoldToId() {
        return soldToId;
    }

    public void setSoldToId(String soldToId) {
        this.soldToId = soldToId;
    }

    public String getSoldToName1() {
        return soldToName1;
    }

    public void setSoldToName1(String soldToName1) {
        this.soldToName1 = soldToName1;
    }

    public String getSoldToName2() {
        return soldToName2;
    }

    public void setSoldToName2(String soldToName2) {
        this.soldToName2 = soldToName2;
    }

    public String getSoldToCtry() {
        return soldToCtry;
    }

    public void setSoldToCtry(String soldToCtry) {
        this.soldToCtry = soldToCtry;
    }

    public String getRecIssueWh() {
        return recIssueWh;
    }

    public void setRecIssueWh(String recIssueWh) {
        this.recIssueWh = recIssueWh;
    }

    public String getRecIssueLoc() {
        return recIssueLoc;
    }

    public void setRecIssueLoc(String recIssueLoc) {
        this.recIssueLoc = recIssueLoc;
    }

    public String getRecStorageArea() {
        return recStorageArea;
    }

    public void setRecStorageArea(String recStorageArea) {
        this.recStorageArea = recStorageArea;
    }

    public String getRecBinNo() {
        return recBinNo;
    }

    public void setRecBinNo(String recBinNo) {
        this.recBinNo = recBinNo;
    }

    public String getReceivingPartNo() {
        return receivingPartNo;
    }

    public void setReceivingPartNo(String receivingPartNo) {
        this.receivingPartNo = receivingPartNo;
    }

    public String getReceivingUom() {
        return receivingUom;
    }

    public void setReceivingUom(String receivingUom) {
        this.receivingUom = receivingUom;
    }

    public String getAddressSearchField() {
        return addressSearchField;
    }

    public void setAddressSearchField(String addressSearchField) {
        this.addressSearchField = addressSearchField;
    }

    public String getBusinessType() {
        return businessType;
    }

    public void setBusinessType(String businessType) {
        this.businessType = businessType;
    }

    public String getEtaServiceLevel() {
        return etaServiceLevel;
    }

    public void setEtaServiceLevel(String etaServiceLevel) {
        this.etaServiceLevel = etaServiceLevel;
    }

    public Long getEtaDate() {
        return etaDate;
    }

    public void setEtaDate(Long etaDate) {
        this.etaDate = etaDate;
    }

    public String getEtaTimeZone() {
        return etaTimeZone;
    }

    public void setEtaTimeZone(String etaTimeZone) {
        this.etaTimeZone = etaTimeZone;
    }

    public String getBusinessTypeDescription() {
        return businessTypeDescription;
    }

    public void setBusinessTypeDescription(String businessTypeDescription) {
        this.businessTypeDescription = businessTypeDescription;
    }

    public String getCrmServiceTypeDescription() {
        return crmServiceTypeDescription;
    }

    public void setCrmServiceTypeDescription(String crmServiceTypeDescription) {
        this.crmServiceTypeDescription = crmServiceTypeDescription;
    }

    public String getSoid() {
        return soid;
    }

    public void setSoid(String soid) {
        this.soid = soid;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public Long getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Long createdDate) {
        this.createdDate = createdDate;
    }

    public String getChangedBy() {
        return changedBy;
    }

    public void setChangedBy(String changedBy) {
        this.changedBy = changedBy;
    }

    public Long getChangedDate() {
        return changedDate;
    }

    public void setChangedDate(Long changedDate) {
        this.changedDate = changedDate;
    }

    public Integer getDeleteFlag() {
        return deleteFlag;
    }

    public void setDeleteFlag(Integer deleteFlag) {
        this.deleteFlag = deleteFlag;
    }

    public Integer getFinishFlag() {
        return finishFlag;
    }

    public void setFinishFlag(Integer finishFlag) {
        this.finishFlag = finishFlag;
    }

    public String getCrmServiceLevel() {
        return crmServiceLevel;
    }

    public void setCrmServiceLevel(String crmServiceLevel) {
        this.crmServiceLevel = crmServiceLevel;
    }

    public Long getDnCreatedDate() {
        return dnCreatedDate;
    }

    public void setDnCreatedDate(Long dnCreatedDate) {
        this.dnCreatedDate = dnCreatedDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOutboundDoNo() {
        return outboundDoNo;
    }

    public void setOutboundDoNo(String outboundDoNo) {
        this.outboundDoNo = outboundDoNo;
    }

    public String getOutboundDoItem() {
        return outboundDoItem;
    }

    public void setOutboundDoItem(String outboundDoItem) {
        this.outboundDoItem = outboundDoItem;
    }

    public String getDocumentType() {
        return documentType;
    }

    public void setDocumentType(String documentType) {
        this.documentType = documentType;
    }

    public String getRefDocNo() {
        return refDocNo;
    }

    public void setRefDocNo(String refDocNo) {
        this.refDocNo = refDocNo;
    }

    public String getRefDocItem() {
        return refDocItem;
    }

    public void setRefDocItem(String refDocItem) {
        this.refDocItem = refDocItem;
    }

    public String getPickingGroup() {
        return pickingGroup;
    }

    public void setPickingGroup(String pickingGroup) {
        this.pickingGroup = pickingGroup;
    }

    public String getPickingGroupItem() {
        return pickingGroupItem;
    }

    public void setPickingGroupItem(String pickingGroupItem) {
        this.pickingGroupItem = pickingGroupItem;
    }

    public String getOutboundDoItemStatus() {
        return outboundDoItemStatus;
    }

    public void setOutboundDoItemStatus(String outboundDoItemStatus) {
        this.outboundDoItemStatus = outboundDoItemStatus;
    }

    public String getWarehouse() {
        return warehouse;
    }

    public void setWarehouse(String warehouse) {
        this.warehouse = warehouse;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getStorageArea() {
        return storageArea;
    }

    public void setStorageArea(String storageArea) {
        this.storageArea = storageArea;
    }

    public String getBinNo() {
        return binNo;
    }

    public void setBinNo(String binNo) {
        this.binNo = binNo;
    }

    public String getExtWarehouse() {
        return extWarehouse;
    }

    public void setExtWarehouse(String extWarehouse) {
        this.extWarehouse = extWarehouse;
    }

    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project;
    }

    public String getCrmPriority() {
        return crmPriority;
    }

    public void setCrmPriority(String crmPriority) {
        this.crmPriority = crmPriority;
    }

    public String getEndCustomerName() {
        return endCustomerName;
    }

    public void setEndCustomerName(String endCustomerName) {
        this.endCustomerName = endCustomerName;
    }

    public String getFsEngineer() {
        return fsEngineer;
    }

    public void setFsEngineer(String fsEngineer) {
        this.fsEngineer = fsEngineer;
    }
}
