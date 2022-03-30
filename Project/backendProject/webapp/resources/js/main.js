const userId = document.querySelector('#id');

	document.querySelector('form').addEventListener('submit', function (evt) {
		// console.log(id.value);

		evt.preventDefault();
		if (!userId.value) {
			alert('아이디를 입력해주세요');
			userId.value = '';
			userId.focus();
		}

		var id = $("input[name='id']").val();
		var pw = $("input[name='pw']").val();

		$.ajax({
			type: "POST",
			url: "/backendProject/login.do",
			data: {
				id: id,
				pw: pw
			},
			success: function (data) {
				alert(data);				
			},
			fail: function () {
				alert("connection fail");
			},
		});

	})


