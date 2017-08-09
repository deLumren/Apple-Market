<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>iShop | ${product.name}</title>
</head>
<body>
    <h2>${product.name}</h2>
    <h3>Цена: ${product.price} USD</h3>
    <div>
        <p>
            <strong>Характеристики:</strong> <br/>
            Цвет: ${product.color} <br/>
            Экран: ${product.display} <br/>
            Память: ${product.capacity} GB<br/>
        </p>
        <form method="post" action="<c:url value="/products/${product.id}/addToBasket"/>">
            <a href="<c:url value="/products"/>"><button type="button">Вернуться</button></a>
            <button type="submit">Добавить в корзину</button>
        </form>
    </div>
    <hr/>
    <c:if test="${currentOrder.products.size() > 0}">
        <p><strong><i>Количество товаров в корзине: ${currentOrder.products.size()}.
            Общая сумма ${currentOrder.totalAmount}</i></strong> </p>
        <a href="<c:url value="/orders/newOrder"/> "><button>Перейти к оформлению заказа</button></a>
        <hr/>
    </c:if>
    <div>
        <h4>Отзывы:</h4>
        <c:forEach items="${comments}" var="comment">
            <p>
                <i>${comment.dateTime.format(dateTimeFormatter)}</i>
                <strong>${comment.author}</strong> <br/>
                ${comment.text} <br/>
                <u>Оценка: ${comment.rating}</u>
            </p>
        </c:forEach>
        <h4>Оставить свой отзыв</h4>
        <form method="post" action="<c:url value="/comments"/>" >
            <p>
                <label for="name">Имя:</label>
                <input type="text" id="name" name="author"/>
            </p>
            <p>
                <label for="comment">Комментарий:</label>
                <br/>
                <textarea id="comment" name="text" rows="10" cols="30"></textarea>
            </p>
            <p>
                <label>Выставить оценку:</label> <br/>
                <label for="radio1">1</label>
                <input type="radio" id="radio1" name="rating" value="1">
                <label for="radio2">2</label>
                <input type="radio" id="radio2" name="rating" value="2">
                <label for="radio3">3</label>
                <input type="radio" id="radio3" name="rating" value="3">
                <label for="radio4">4</label>
                <input type="radio" id="radio4" name="rating" value="4">
                <label for="radio5">5</label>
                <input type="radio" id="radio5" name="rating" value="5" checked>
            </p>

            <input type="hidden" name="productId" value="${product.id}">
            <button type="submit">Отправить</button>
        </form>
    </div>
</body>
</html>
