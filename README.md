
# 도로명 추출기 road_name_exatractor

---

## 설정

### install jenv
```
$ brew install jenv
```
```
$ brew tap AdoptOepnJDK/openjdk
```
### jdk version 별 설치
```
$ brew install --cask adoptopenjdk8
$ brew install --cask adoptopenjdk11
$ brew install -cask adoptopenjdk15
$ brew install -cask adoptopenjdk16
```

실패시 cask 경로에 adoptopenjdk/openjdk/ 추가

e.g.
```
brew install --cask AdoptOepnJDK/openjdk/adoptopenjdk11
```

설치 확인
```
/usr/libexec/java_home -V
```

### jenv 추가
```
$ jenv add/Libarary/Java/JavaVirtualMachins/adoptopenjdk-8.jdk/Contents/Home
$ jenv add/Libarary/Java/JavaVirtualMachins/adoptopenjdk-11.jdk/Contents/Home
$ jenv add/Libarary/Java/JavaVirtualMachins/adoptopenjdk-15.jdk/Contents/Home
$ jenv add/Libarary/Java/JavaVirtualMachins/adoptopenjdk-16.jdk/Contents/Home
```

```
$ jenv enable-plugin export
```

### jenv global 설정
/Users/iljoo.moon/.jenv/version

```
$ jenv global 11.0
$ jenv global
```

### jenv local 설정
```
$ jenv local 11
$ jenv local
$ java --version
```

---

## 실행
1. main 클래스에서 자바 파일을 Run 한다.
2. '터미널에 수기로 작성된 주소를 입력해주세요' 메시지가 뜨면 도로명 추출을 원하는 메세지를 입력한다. 
3. 결과를 확인한다.