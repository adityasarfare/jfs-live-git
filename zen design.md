- :books: (courses)
- :dart: ( course goals)
- :beginner: (module)
- :rocket: (topic)
- :electron: :atom: :basecamp: :tea:  (sub level headings)
- :lock: :key: (problem and solution)
- :zero: to :nine: (important steps)
- :gem: (summary)
- :beetle: (bug)
- :loudspeaker: (important note)
- :bulb: (idea)
- :thumbsup: :thumbsdown: (advantage, disadvantage)
- :heavy_check_mark: :x: (best practices, - to do and not to do )
- :tada: (congratulations)

``` java
class Simple{  
    public static void main(String args[]){  
     System.out.println("Hello Java");  
    }  
}  
```

> Success is great  
`peace is god   ` 

**power of now**  

*unleash the power withing*

``` javascript
<!DOCTYPE html>
<html>
<head>
<script>
function myFunction() {
  document.getElementById("demo").innerHTML = "Hello World!";
}
</script>
</head>

<body>

<p>When you click "Try it", a function will be called.</p>
<p>The function will display a message.</p>

<button onclick="myFunction()">Try it</button>

<p id="demo"></p>

</body>
</html>
```

``` c#
Live Demo
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System;

namespace InterfaceApplication {
   
   public interface ITransactions {
      // interface members
      void showTransaction();
      double getAmount();
   }
   public class Transaction : ITransactions {
      private string tCode;
      private string date;
      private double amount;
      
      public Transaction() {
         tCode = " ";
         date = " ";
         amount = 0.0;
      }
      public Transaction(string c, string d, double a) {
         tCode = c;
         date = d;
         amount = a;
      }
      public double getAmount() {
         return amount;
      }
      public void showTransaction() {
         Console.WriteLine("Transaction: {0}", tCode);
         Console.WriteLine("Date: {0}", date);
         Console.WriteLine("Amount: {0}", getAmount());
      }
   }
   class Tester {
     
      static void Main(string[] args) {
         Transaction t1 = new Transaction("001", "8/10/2012", 78900.00);
         Transaction t2 = new Transaction("002", "9/10/2012", 451900.00);
         
         t1.showTransaction();
         t2.showTransaction();
         Console.ReadKey();
      }
   }
}
```