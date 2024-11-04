package com.example.demo.constant;

public interface JcoConstant {
    /**
     * 分隔符
     */
    String DELIMITER = ";";
    /**
     * 补0常量（18位）
     */
    String ZERO_FULL = "000000000000000000";

    /**
     * 表信息
     */
    public interface Tables{
        String ZGLT_AVL_STOCK = "ZGLT_AVL_STOCK";
        public interface ZGLT_AVL_STOCK_FIELD {
            //partNo
            String MATNR = "MATNR";
            //plant & warehouse
            String WERKS = "WERKS";
            //location
            String LGORT = "LGORT";
            String AVAIQTY = "AVAIQTY";
            String CREADT = "CREADT";
        }
        public interface ZGLT_AVL_STOCK_ATTR{
            //MATNR字段前置补0总位数
            Integer MATNR_ZERO_FILL_LENGTH = 18;
        }

        String MARD = "MARD";
        public interface MARD_FIELD {
            //partNo
            String MATNR = "MATNR";
            //plant & warehouse
            String WERKS = "WERKS";
            //location
            String LGORT = "LGORT";
            String LABST = "LABST";
        }

        //cecc
        String KNKK = "KNKK";
        public interface KNKK_FIELD {
            //sold to
            String KUNNR = "KUNNR";
            //credit check control area
            String KKBER = "KKBER";
            //credit account id
            String KNKLI = "KNKLI";
        }

        String KNVK = "KNVK";
        public interface KNVK_FIELD {
            //soldTo
            String KUNNR = "KUNNR";
            //partner no
            String PARNR = "PARNR";
            //first name
            String NAMEV = "NAMEV";
            //last name
            String NAME1 = "NAME1";
        }

        String MARC = "MARC";
        public interface MARC_FIELD{
            //partNo
            String MATNR = "MATNR";
            //warehouse
            String WERKS = "WERKS";
            //Control code
            String STEUC = "STEUC";
        }

        String A502 = "A502";
        public interface A502_FIELD{
            //partNo
            String MATNR = "MATNR";
            //warehouse
            String WERKS = "WERKS";
            String VKORG = "VKORG";
            String ALAND = "ALAND";
            String KSCHL = "KSCHL";
            String KAPPL = "KAPPL";
        }

        String A921 = "A921";
        public interface A921_FIELD{
            //partNo
            String MATNR = "MATNR";
            String VKORG = "VKORG";
            String KSCHL = "KSCHL";
            String KAPPL = "KAPPL";
        }

        String VBEP = "VBEP";
        public interface VBEP_FIELD{
            //ecc so no
            String VBEP_VBELN = "VBELN";
            //ecc so item no
            String VBEP_POSNR = "POSNR";
            //ecc so item schedule line
            String VBEP_ETENR = "ETENR";
            //ecc so item schedule line qty
            String VBEP_WMENG = "WMENG";
            //po no
            String VBEP_BANFN = "BANFN";
            //po item no
            String VBEP_BNFPO = "BNFPO";

            String[] VBEP_FIELD = new String[]{VBEP_VBELN,VBEP_POSNR,VBEP_ETENR,VBEP_WMENG,VBEP_BANFN,VBEP_BNFPO};
        }

        String EBAN = "EBAN";
        public interface EBAN_FIELD{
            //po no
            String EBAN_BANFN = "BANFN";
            //po item no
            String EBAN_BNFPO = "BNFPO";
            //po status
            String EBAN_STATU = "STATU";
            //状态编码，B=已经创建
            String STATU_B = "B";

            String[] EBAN_FIELD = new String[]{EBAN_BANFN,EBAN_BNFPO,EBAN_STATU};
        }

        String ZSDT_ZIPCODE = "ZSDT_ZIPCODE";
        interface ZSDT_ZIPCODE_FIELD {
            //sales entity
            String VKORG = "VKORG";
            //postal code
            String PSTLZ = "PSTLZ";
            //region
            String REGION = "REGION";
            //Ship from Groping Code
            String GPCODE = "GPCODE";
            //COUNTRY
            String COUNTRY = "COUNTRY";
        }

        String ZSDT_SHIPFRMGRP = "ZSDT_SHIPFRMGRP";
        interface ZSDT_SHIPFRMGRP_FIELD {
            //sales entity
            String VKORG = "VKORG";
            //Ship from Groping Code
            String GPCODE = "GPCODE";
            //business type
            String ZBUSTP = "ZBUSTP";
            //storage location
            String LGORT = "LGORT";
        }

        String ZSDT_PRECUSRS = "ZSDT_PRECUSRS";
        interface ZSDT_PRECUSRS_FIELD {
            //sales entity
            String VKORG = "VKORG";
            //Plant/warehouse
            String WERKS = "WERKS";
            //storage location
            String LGORT = "LGORT";
            //part no
            String MATNR = "MATNR";
            //quantity
            String REQ_QTY = "REQ_QTY";
        }
    }
}
