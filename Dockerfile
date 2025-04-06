# ベースイメージを指定（Java 17 で OK）
FROM eclipse-temurin:17-jdk

# 作業ディレクトリを作成
WORKDIR /app

# プロジェクトの全ファイルをコピー
COPY . .

# mvnw に実行権限を付与
RUN chmod +x mvnw

# JAR ファイルのビルド（テストをスキップする場合は -DskipTests を追加）
RUN ./mvnw clean package -DskipTests

# JAR ファイルの実行（ファイル名は target/ にできた JAR に合わせて）
CMD ["java", "-jar", "target/sleep-api-0.0.1-SNAPSHOT.jar"]

