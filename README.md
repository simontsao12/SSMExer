# SSMExer

## 專案概述

SSMExer 是一個基於 Java 的學習專案，旨在練習 SSM（Spring + Spring MVC + MyBatis） 相關的概念與操作。目前僅有實現查詢功能。

## 運作流程

1. Web 應用啟動時，當 Servlet 容器（Tomcat）加載 Web 應用時，自動搜索並解析 WEB-INF/web.xml 文件。
2. 因為 web.xml 有配置 Spring MVC 設定檔自訂的位置和名稱，所以會去加載 springmvc.xml 檔案。
3. 因為 web.xml 有配置 Spring 的監聽器，所以載入 Spring 的設定檔（spring.xml）。

## 設定檔

- `spring.xml`： Spring 設定檔案，管理除了 controller 以外的組件。
- `springmvc.xml`： Spring MVC 設定檔案，管理 controller 組件。
- `log4j.xml`： 日誌設定檔。
- `mybatis-config.xml`： MyBatis 設定檔。
- `jdbc.properties`： 通用 JDBC 配置。

## 需求

- JDK 版本： 11+
- Spring MVC 版本： 5.3.1
- MySQL 版本： 8
- MyBatis 版本： 3.5.7
- Maven 版本： 3.9.9
- Tomcat 9.0.83

## 使用方式

1. **安裝依賴：** 確保已安裝 JDK 和相關資料庫，並設定相關依賴。
2. **配置資料庫：** 修改 `jdbc.properties` 等設定檔中的參數，以匹配您的資料庫設定。
3. **導入專案：** 使用 IDE（如 IntelliJ IDEA 或 Eclipse）導入專案。
4. **執行測試：** 選擇並運行對應的測試類進行學習。

## 注意事項

- 確保資料庫服務已啟動，並正確設定用戶名與密碼。
- 在執行涉及資源的操作時，請檢查相關文件路徑是否有效。

## 主要學習資源

- Servlet & JSP技術手冊 : 邁向Spring Boot 作者：林信良。
- 【尚硅谷】SSM框架全套教程，MyBatis+Spring+SpringMVC+SSM整合一套通關。

## 貢獻者

此專案僅為學習用途。
