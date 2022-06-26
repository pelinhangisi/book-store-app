
# Book Store Application 

 ## Kullanılan Teknolojiler

* Java
* Java Spring Boot
* Postman
* H2 Database

### Proje Akışı: <br>
    
    1- İlk etap olarak Katmanlı mimari kullanacağımız için kendi katmanlarımızı oluşturuyoruz. Ve SOLID prensibine uygun 
    şekilde çalışmaya özen gösteriyoruz
    -controller -> BookStoreController
    -dto -> BookOrderRequest
    -dao -> BookRepository & OrderRepository
    -entity -> Book & Order(Order db ortamında bir request ismi olması sebebiyle tablodaki isminin değiştirilmesi gerekir.)
    -service -> BookService & OrderService

    2- application.properties kısmında hangi database kullanacaksak onunla alakalı bilgilendirme yapmamız gerekiyor.
    Bu proje dahilinde biz H2 kullandığımız için bilgilerini aktarıyoruz. PostgreSQL, Mysql vs.. seçenek size kalmış

    3- Katmanlı mimarimizi oluşturduktan sonra projemizin akışında 
    * BookStoreController içerisine eklediğimiz Postmapping endpointi içerisinde bir BookOrderRequest alıyor.
    * BookOrderRequest imizin içerisinde  bookIdList ve userName imimiz var. 
    * Buradan OrderService e aktarılıp BookService kısmından Book'ların listesini alıp, price'larını toplayıp, 
    totalPrice hesaplaması yapıyor.
    * Akabinde totalPrice ve userName ile birlikte veri tabanına order objesine yazıyor ve bizde bu order objesini 
    kullanıcıya iletir hale getirebiliyoruz. 

    


## Reference

* Spring Boot Bootcamp
* [FolksDev](https://www.youtube.com/watch?v=i_z4h6dRLb4&t=167s)
