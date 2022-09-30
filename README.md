# NGO団体とユーザーのマッチングサービスの開発

## バックエンド
- Java Spring Bootを採用
- java-version 17
- Gradle Project
- [x] spring initializrよりGENERATE

### application.propertiesの設定
- 以下のパスに新しくファイルを作成
```
React-Java-Hello/my-app-backend/src/main/resources/application.properties
```

- 各々にあったDB名、ユーザー名、パスワードを記述
```
spring.datasource.url=jdbc:postgresql://localhost:5432/~~~
spring.datasource.username=~~~
spring.datasource.password=~~~
spring.datasource.driver-class-name=org.postgresql.Driver
mybatis.configuration.map-underscore-to-camel-case=true
mybatis.mapper-locations=classpath*:com.example.myappbackend/mapper/*.xml
```

## フロントエンド
- React, Redux, TypeScript
- Redux-sagaを採用

```
npx create-react-app my-app-frontend --template redux-typescript
```
```
npm start
```
より、実行

## DB
- Postgresqlを採用
- 詳しくは以下のWikiを参照
- https://github.com/Ryosuke2022053/React-Java-Hello/wiki/DB%E4%BD%9C%E6%88%90 
