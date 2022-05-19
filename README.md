# 마크다운 명명법
https://daringfireball.net/projects/markdown/

# 주석
```md
<!-- 주석  -->
```
<!-- # 제목 -->
내용이 있지만 보이지 않음

```
H1
=
H2
-
```
<br>

H1 (원래 글씨 크기)

H1
=
<br>
H2 (원래 글씨 크기)

H2
-

<br>

# 제목 (Header)
```
# h1
## h2
### h3
#### h4
##### h5
###### h6
####### h7
```
# h1
## h2
### h3
#### h4
##### h5
###### h6
####### h7

h7(#7개 부터는 실행되지 않는다.)

 <br>

# 목록(List)

## 순서가 없는 목록( -, * , + )
```
- 순서가 없는 목록
    - 서브 목록
    - 서브 목록
        - 서브 서브 목록

- 순서가 없는 목록
    * 서브 목록
    + 서브 목록
        - 서브 서브 목록

표기법의 상관관계는 없이 동등하다.
```

- 순서가 없는 목록 -
    - 서브 목록 -
    - 서브 목록 -
        - 서브 서브 목록 -

- 순서가 없는 목록 -
    * 서브 목록 * 
    + 서브 목록 + 
        - 서브 서브 목록 - 
  
  <br>

## 순서가 있는 서브목록( 1. , 2. , 3. )
```
1. 순서가 있는 서브 목록 
    1. 서브 목록
    2. 서브 목록
        1. 서브 서브 목록

2. 순서가 있는 서브목록
   1. 서브 목록
   4. 서브 목록
      1. 서브 서브 목록
   5. 목록

1. 순서
    1. 상관
    1. 업이
        1. 적히는
    1. 기능
1. 이다.
    1. 얍
```

1. 순서가 있는 서브 목록 
    1. 서브 목록
    2. 서브 목록
        1. 서브 서브 목록

2. 순서가 있는 서브목록
   1. 서브 목록
   4. 서브 목록
      1. 서브 서브 목록
   5. 목록

1. 번호
    1. 상관
    1. 업이
        1. 적히는
    1. 기능
1. 이다.
    1. 얍
   
순서가 있는 목록은 적힌 번호와 상관없이 순서대로 적힌다.

<br>

# 강조 (Emphasis)

```
*이탤릭체*
_이탤릭체_

**볼드체**
__볼드체__

~~취소선~~
```
*이탤릭체*

_이탤릭체_

**볼드체**

__볼드체__

~~취소선~~

<br>

# 코드 블럭(Code)

```
'한줄 코드'


```

```md

    ```java
    자바 여러줄 코드 
    ```
    ```python
    파이썬 여러줄 코드 
    ```

```

`한줄 코드`

```java
여러줄 코드 
println("여러줄 코드를 입력하고 색변하" );
int a = 0;
String str = "들여쓰기 가능";
    public int java(){
        System.out.println("가능합니다.")
    }
```
```python
여러줄 코드 
```

<br>

# 링크 (Links)

```
[GOOGLE](https://google.com)을 눌러서 구글로 이동하세요.

[URL링크] <example@example.com>
```

[GOOGLE](https://google.com)을 눌러서 구글로 이동하세요.


[URL링크] <example@example.com>

<br>

# 이미지 (Images)

```
Git 로고입니다.

![Git로고](https://git-scm.com/images/logo@2x.png)
```

Git 로고입니다.

![Git로고](https://git-scm.com/images/logo@2x.png)

<br>

# 인용 (Blockquote)

```

>> 중첩된 인용문 1
>>> 중첩된 인용문 2
>>>> 중첩된 인용문 3
>>>>> 중첩된 인용문 4
>>>>>> 중첩된 인용문 5
```

> 인용문 작성
>> 중첩된 인용문 1
>>> 중첩된 인용문 2
>>>> 중첩된 인용문 3
>>>>> 중첩된 인용문 4

<br>

# 표 (Table)

- `파이프( | )`와 `하이픈( - )`을 이용해서 행과 열을 구분합니다.
- 테이블 양쪽 끝의 `파이프( | )`는 생략 가능합니다.
```
| 동물   | 종류   | 다리 개수 |
| ------ | ------ | --------- |
| 사자   | 포유류 | 4개       |
| 닭     | 조류   | 2개       |
| 도마뱀 | 파충류 | 4개       |
```

| 동물   | 종류   | 다리 개수 |
| ------ | ------ | --------- |
| 사자   | 포유류 | 4개       |
| 닭     | 조류   | 2개       |
| 도마뱀 | 파충류 | 4개       |


# 수평선 (Horizontal Rule)

```
---

***

___

```

---

***

___