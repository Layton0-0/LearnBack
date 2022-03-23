const userId = document.querySelector('input[name="id"]');
const userPw = document.querySelector('input[name="pw"]');

var forms = document.querySelectorAll('.needs-validation')

Array.prototype.slice.call(forms)
  .forEach(function (form) {
    form.addEventListener('submit', function (event) {
      if (!form.checkValidity()) {
        event.preventDefault()
        event.stopPropagation()
      }

      form.classList.add('was-validated')
    }, false)
  })


/*$(document).ready(function () {
     $(".loginForm").submit(function () {
       var memberVo = {
         name: $('input[name="name"]').val(),
         // console.log(name);
         id: $('input[name="id"]').val(),
         pw: $('input[name="pw"]').val(),
         tel: $('input[name="tel"]').val(),
         address: $('input[name="address"]').val(),
         email: $('input[name="email"]').val(),
         birth: $('input[name="birth"]').val(),
         age: $('input[name="age"]').val(),
         sex: $('input[name="sex"]').val(),
       };

       console.log(memberVo);

       $.ajax({
         method: "POST",
         url: "/backendMiniProject/signup.do",
         data: memberVo,
         success: function (data) {
           console.log(data.status);
           /* location.assign("/resources/html/signup.html");
         },
error: function (error) {
console.log(error);
},
       });
     });
   }); */