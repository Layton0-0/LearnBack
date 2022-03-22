const userId = document.querySelector('input[name="id"]');
const userPw = document.querySelector('input[name="pw"]');

document.querySelector('.loginForm').addEventListener('submit', function (evt) {
  evt.preventDefault();
  // console.log(id.value)
  // console.log(pw.value)
})

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