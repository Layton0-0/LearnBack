$(".searchForm").submit(function () {

  $.ajax({
    method: "POST",
    url: "/backendMiniProject/searchItem.do",
    data: {
      pdName: $('input[name="searchItem"]').val()
    },
    success: function (data) {
      console.log(data.status);
    },
    error: function (error) {
      console.log(error);
    },
  });
});